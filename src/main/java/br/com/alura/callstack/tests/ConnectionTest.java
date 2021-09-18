package br.com.alura.callstack.tests;

import br.com.alura.callstack.model.Connection;

public class ConnectionTest {

    public static void main(String[] args) {

        try (Connection connection = new Connection() ) {
            connection.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }
    }

    //-----------------------------

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//		}
}
