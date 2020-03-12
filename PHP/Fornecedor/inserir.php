<?php
include 'conexao.php';
$fornec = selectAllPessoa();
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
                        <th><input type="text" name="cnpj" value="" /></th>
                    </tr>
                    <tr>
                        <td>Razão Social</td>
                        <th><input type="text" name="raz_social" value="" /></th>
                    </tr>
                    <tr>
                        <td>Nome Fantasia</td>
                        <th><input type="text" name="nome_fantasia" value="" /></th>
                    </tr>
                    <tr>
                        <td>Cidade</td>
                        <th><input type="text" name="cidade" value="" /></th>
                    </tr>
                    <tr>
                        <td>Rua</td>
                        <th><input type="text" name="rua" value="" /></th>
                    </tr>
                    <tr>
                        <td>Número</td>
                        <th><input type="text" name="numero" value="" /></th>
                    </tr>
                    <tr>
                        <td>Estado</td>
                        <th><input type="text" name="estado" value="" /></th>
                    </tr>
                    <tr>
                        <td>Telefone</td>
                        <th><input type="text" name="telefone" value="" /></th>
                    </tr>
                    <tr>
                        <td>E-mail</td>
                        <th><input type="text" name="email" value="" /></th>
                    </tr>
                    <tr>
                        <td>Vendedor</td>
                        <th><input type="text" name="vendedor" value="" /></th>
                    </tr>
                    <tr>
                        <td><input type="hidden" name="Acao" value="inserir" /></td>
                        <td><input type="submit" value="Enviar" name="Enviar" /></td>
                    </tr>
                </tbody>
            </table>
    </body>
</form>
