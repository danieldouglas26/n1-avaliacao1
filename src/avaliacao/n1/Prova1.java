/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package avaliacao.n1;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 08/03/2024
 * @brief Class Prova1
 */
public class Prova1 {

    public static void main(String[] args) throws InterruptedException {

        int opcao = 0, qde_expresso = 0, qde_capuccino = 0,
                qde_leite_com_cafe = 0, qde_cafes_vendidos;
        double valor_expresso, valor_capuccino,
                valor_leite_com_cafe, valor_cafes_vendidos;
        double[] valorproduts = new double[10];
        String[] nomeproduts = new String[10];
        double valorfinal;
        double valorfinalteste = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Forneça uma opção: \n"
                    //    + "1 ­ café expresso; \n"
                    //    + "2 ­ café capuccino; \n"
                    //    + "3 ­ leite com café; \n"
                    + "1  visualizar produtos­; \n"
                    + "2  ­adicionar e exclu ir produtos; \n"
                    + "3 ­ totalizar vendas; \n"
                    + "4 ­SAIR;");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    double opcaoteste = 0;
                    while (opcaoteste != 12) {
                        System.out.println("Forneça uma opcao: - (Aperte 12 para sair) \n"
                                + "1 ­cafe expresso; \n"
                                + "2 ­cafe capuccino; \n"
                                + "3 ­leite com cafe;");

                        for (int i = 1; i < 10; i++) {
                            if (nomeproduts[i] == "" || valorproduts[i] == 0.0) {
                                i = 11;
                            } else {
                                System.out.println(i + 3 + " " + " " + nomeproduts[i] + " " + " " + valorproduts[i] + ";");
                            };

                        }

                        opcaoteste = sc.nextInt();

                        if (opcaoteste == 1) {
                            qde_expresso++;
                        } else if (opcaoteste == 2) {
                            qde_capuccino++;
                        } else if (opcaoteste == 3) {
                            qde_leite_com_cafe++;
                        }

                        if (opcaoteste > 3) {
                            opcaoteste = opcaoteste - 3;
                            for (int i = 1; i == opcaoteste; i++) {
                                valorfinalteste = valorproduts[i];
                                System.out.println("valor produtos");
                                //break;
                            }
                        }

                    }

                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Forneça uma opção: \n"
                            + "1 ­adicionar produto (Ate 10 opcoes); \n"
                            + "2 excluir produto; \n");
                    opcao = 0;
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o nome do produto: ");
                            String opcaonome;
                            opcaonome = sc.next();
                            for (int i = 1; i < 10; i++) {
                                //if (nomeproduts [i] == "") {
                                nomeproduts[i] = opcaonome;
                                i = 10;
                                //}
                            }
                            System.out.println("Digite o valor do produto: ");
                            double opcaovalor;
                            opcaovalor = sc.nextDouble();
                            for (int i = 1; i < 10; i++) {
                                if (valorproduts[i] == 0) {
                                    valorproduts[i] = opcaovalor;
                                    System.out.println("");
                                    System.out.println("Chave do produtos: " + i);
                                    System.out.println("");
                                    i = 10;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println("Digite a chave do programa que deseja excluir: ");
                            System.out.println("");
                            int opcao3 = sc.nextInt();

                            for (int i = 1; i == opcao3; i++) {
                                if (opcao3 >= 0 && opcao3 <= 10) {
                                    System.out.println(nomeproduts[i]);
                                    System.out.println(valorproduts[i]);
                                    nomeproduts[i] = "";
                                    valorproduts[i] = 0.0;
                                }
                                System.out.println("");
                                System.out.println("Produtos excluidos!");
                                System.out.println("");
                            }

                            break;
                    }
                    break;
                case 3:
                    valor_expresso = qde_expresso * 0.75;
                    valor_capuccino = qde_capuccino;
                    valor_leite_com_cafe = qde_leite_com_cafe * 1.25;
                    qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe;
                    valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe;

                    System.out.println("Qde café expresso: " + qde_expresso + " ­ valor: " + valor_expresso);
                    System.out.println("Qde café capuccino: " + qde_capuccino + " ­ valor: " + valor_capuccino);
                    System.out.println("Qde leite com café: " + qde_leite_com_cafe
                            + " ­ valor: " + valor_leite_com_cafe);
                    System.out.println("Qde cafés vendidos: " + qde_cafes_vendidos
                            + " ­ valor cafés vendidos: " + valor_cafes_vendidos);
                    valorfinal = valor_cafes_vendidos + valorfinalteste;

                    opcao = 6;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opção inválida");
                    System.out.println("");
            }

            /* 
            - Código anterior, feito pelo próprio professor (início)
            if (opcao == 1) {
                qde_expresso++;
            } else if (opcao == 2) {
                qde_capuccino++;
            } else if (opcao == 3) {
                qde_leite_com_cafe++;
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
            Código anterior, feito pelo próprio professor (fim) 
             */
        } while (opcao != 4);

        // Parte final do algóritimo dos cafés foi realocado para o Switch, em específico no case 5.
    }
}
