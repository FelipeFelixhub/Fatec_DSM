Public Class frm_clientes
    Private Sub img_foto_Click(sender As Object, e As EventArgs) Handles img_foto.Click
        Try
            With OpenFileDialog1
                .Title = "SELECIONE UMA FOTO"
                .InitialDirectory = Application.StartupPath & "\fotos"
                .ShowDialog()
                diretorio = .FileName
                img_foto.Load(diretorio)
            End With
        Catch ex As Exception
            Exit Sub
        End Try
    End Sub

    Private Sub frm_clientes_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        conectar_banco()
        carregar_dados()
        carregar_tipo()

    End Sub

    Private Sub TabPage1_Click(sender As Object, e As EventArgs) Handles TabPage1.Click

    End Sub

    Private Sub btn_gravar_Click(sender As Object, e As EventArgs) Handles btn_gravar.Click
        Try
            SQL = "select * from cadastro where cpf= '" & txt_cpf.Text & "'"
            rs = db.Execute(SQL)
            If rs.EOF = True Then 'Se nao existir o cpf entao'
                SQL = "insert into cadastro (cpf,nome,foto) values ('" & txt_cpf.Text & "'," &
                    "'" & txt_nome.Text & "','" & diretorio & "')"
                rs = db.Execute(UCase(SQL))
                MsgBox("Dados gravados com sucesso!", MsgBoxStyle.Information + MsgBoxStyle.OkOnly, "AVISO")
                txt_cpf.Clear()
                txt_nome.Clear()
                img_foto.Load(Application.StartupPath & "\Fotos\nova_foto.png")
                txt_cpf.Focus()
                carregar_dados()
            Else
                MsgBox("CPF já cadastrado!", MsgBoxStyle.Information + MsgBoxStyle.OkOnly, "AVISO")
                Exit Sub
            End If

        Catch ex As Exception
            MsgBox("Erro ao gravar!", MsgBoxStyle.Critical + MsgBoxStyle.OkOnly, "AVISO")
        End Try
    End Sub

    Private Sub txt_cpf_LostFocus(sender As Object, e As EventArgs) Handles txt_cpf.LostFocus
        Try
            SQL = "SELECT * FROM cadastro WHERE cpf = '" & txt_cpf.Text & "'"
            rs = db.Execute(SQL)
            If rs.EOF = False Then
                txt_nome.Text = rs.Fields(2).Value
                img_foto.Load(rs.Fields(3).Value)
            Else
                txt_nome.Focus()
            End If
        Catch ex As Exception
            MsgBox("ERRO | Consulta ao CPF no banco!", MsgBoxStyle.Critical + MsgBoxStyle.OkOnly, "AVISO")
        End Try
    End Sub

    Private Sub ToolStripLabel1_Click(sender As Object, e As EventArgs) Handles ToolStripLabel1.Click

    End Sub

    Private Sub txt_busca_TextChanged(sender As Object, e As EventArgs) Handles txt_busca.TextChanged
        Try
            SQL = "SELECT * FROM cadastro WHERE " & cmb_tipo.Text & " like '" & txt_busca.Text & "%'"
            rs = db.Execute(SQL)
            With dgv_dados
                cont = 1
                .Rows.Clear()
                Do While rs.EOF = False
                    .Rows.Add(cont, rs.Fields(1).Value, rs.Fields(2).Value, Nothing, Nothing)
                    rs.MoveNext()
                    cont = cont + 1
                Loop
            End With
        Catch ex As Exception
            MsgBox("ERRO!!", MsgBoxStyle.Critical + MsgBoxStyle.OkOnly, "AVISO")
        End Try
    End Sub

    Private Sub Dgv_dados_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles dgv_dados.CellContentClick
        Try
            With dgv_dados
                If .CurrentRow.Cells(3).Selected = True Then
                    aux_cpf = .CurrentRow.Cells(1).Value
                    SQL = "select * from cadastro where cpf='" & aux_cpf & "'"
                    rs = db.Execute(SQL)
                    If rs.EOF = False Then
                        TabControl1.SelectTab(0) 'Focando na aba dados pessoais
                        txt_cpf.Text = rs.Fields(1).Value
                        txt_nome.Text = rs.Fields(2).Value
                        img_foto.Load(rs.Fields(3).Value)
                    End If
                ElseIf .CurrentRow.Cells(4).Selected = True Then
                    aux_cpf = .CurrentRow.Cells(1).Value
                    SQL = "select * from cadastro where cpf='" & aux_cpf & "'"
                    rs = db.Execute(SQL)
                    If rs.EOF = False Then
                        resp = MsgBox("Deseja realmente excluir o CPF: " & aux_cpf & "?", MsgBoxStyle.Question + MsgBoxStyle.YesNo, "ATENÇÃO")
                        If resp = MsgBoxResult.Yes Then
                            SQL = "delete from cadastro where cpf='" & aux_cpf & "'"
                            rs = db.Execute(SQL)
                            carregar_dados()
                        End If
                    End If
                Else
                    Exit Sub
                End If
            End With
        Catch ex As Exception
            Exit Sub
        End Try
    End Sub
End Class