<?php
include "conexao.php";
$fornecedor=selectIdPessoa($_POST["id"]);
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastro Fornecedor</title>
    </head>
    <body>
        <h3>Cadastro Fornecedor</h3>
        <form name="dadosFornecedor" action="conexao.php" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <th>CNPJ</th>
                        <th><input type="text" name="cnpj" value="<?=$fornecedor["cnpj"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Razão Social</td>
                        <th><input type="text" name="raz_social" value="<?=$fornecedor["raz_social"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Nome Fantasia</td>
                        <th><input type="text" name="nome_fantasia" value="<?=$fornecedor["nome_fantasia"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Cidade</td>
                        <th><input type="text" name="cidade" value="<?=$fornecedor["cidade"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Rua</td>
                        <th><input type="text" name="rua" value="<?=$fornecedor["rua"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Número</td>
                        <th><input type="text" name="numero" value="<?=$fornecedor["numero"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Estado</td>
                        <th><input type="text" name="estado" value="<?=$fornecedor["estado"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Telefone</td>
                        <th><input type="text" name="telefone" value="<?=$fornecedor["telefone"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>E-mail</td>
                        <th><input type="text" name="email" value="<?=$fornecedor["email"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>Vendedor</td>
                        <th><input type="text" name="vendedor" value="<?=$fornecedor["vendedor"]?>" size="30" /></th>
                    </tr>
                    <tr>
                        <td>
                            <input type="hidden" name="Acao" value="alterar" />
                            <input type="hidden" name="id" value="<?=$fornecedor["id"]?>" />
                        </td>
                        <td>
                            <input type="submit" value="Enviar" name="Enviar" />
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>.
    </body>
</html>
