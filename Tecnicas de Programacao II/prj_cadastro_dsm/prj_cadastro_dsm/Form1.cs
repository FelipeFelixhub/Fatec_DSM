using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Linq.Expressions;

namespace prj_cadastro_dsm
{
    public partial class Form1 : Form
    {
        SqlConnection conexao;
        SqlCommand comando;
        string SQL;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            conexao = new SqlConnection(@"Server=LAB5-12;Database=cadastro_dsm_p2;trusted_connection=yes");
            try
            {
                conexao.Open();
                MessageBox.Show("Conexão Show!!", "AVISO", MessageBoxButtons.OK,MessageBoxIcon.Information);
            }
            catch
            {
                MessageBox.Show("Erro ao conectar!!", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
        }

        private void btn_salvar_Click(object sender, EventArgs e)
        {
            try
            {
                SQL = "insert into tb_cadastro(cpf,nome) values (@CPF, @NOME)";
                comando = new SqlCommand(SQL, conexao);
                comando.Parameters.AddWithValue("@CPF", txt_cpf.Text);
                comando.Parameters.AddWithValue("@NOME", txt_nome.Text);
                comando.ExecuteNonQuery();
                MessageBox.Show("Dados gravados com sucesso!!", "AVISO", MessageBoxButtons.OK, MessageBoxIcon.Information);
                txt_cpf.Clear();
                txt_nome.Clear();
                txt_cpf.Focus();
            }
            catch 
            {

                MessageBox.Show("Erro ao gravar os dados!!", "ERRO", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            
        }

        private void txt_cpf_Leave(object sender, EventArgs e)
        {
            try
            {
                SQL = "SELECT TOP(1) * FROM tb_cadastro WHERE CPF = @CPF";
                comando = new SqlCommand(SQL, conexao);

                comando.Parameters.AddWithValue("@CPF", txt_cpf.Text);
                var retorno = comando.ExecuteReader();
                if(retorno.Read())
                {
                    txt_nome.Text = retorno.GetValue(2).ToString();
                }
              
            }
            catch (Exception)
            {

                throw;
            }

            
        }
    }
}
