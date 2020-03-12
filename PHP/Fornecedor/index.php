<!DOCTYPE html>
<?php
include 'conexao.php';
$grupo = selectAllPessoa();
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastro Fornecedor</title>
    </head>
    <body>
        <h2>Cadastro Fornecedor</h2>
        <a href="inserir.php">Adicionar Fornecedor</a>


        <form name="cadastro" action="conexao.php" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th>CNPJ</th>
                        <th>Razão Social</th>
                        <th>Fantasia</th>
                        <th>Cidade</th>
                        <th>Rua </th>
                        <th>Número</th>
                        <th>Estado</th>
                        <th>Telefone</th>
                        <th>E-mail</th>
                        <th>Vendedor</th>
                        <th>Editar</th>
                        <th>Excluir</th>
                    </tr>
                </thead>
                <tbody>
                    <?php
                    foreach ($grupo as $fornecedor) {
                        ?>
                        <tr>
                            <td><?= $fornecedor["cnpj"] ?></td>
                            <td><?= $fornecedor["raz_social"] ?></td>
                            <td><?= $fornecedor["nome_fantasia"] ?></td>
                            <td><?= $fornecedor["cidade"] ?></td>
                            <td><?= $fornecedor["rua"] ?></td>
                            <td><?= $fornecedor["numero"] ?></td>
                            <td><?= $fornecedor["estado"] ?></td>
                            <td><?= $fornecedor["telefone"] ?></td>
                            <td><?= $fornecedor["email"] ?></td>
                            <td><?= $fornecedor["vendedor"] ?></td>
                            <td>
                                <form name="alterar" action="alterar.php" method="POST">
                                <input type="hidden" name="id" value=<?=$fornecedor["id"]?> />
                                <input type="submit" value="Editar" name="editar" />
                            </form>
                            </td>
                            <td>
                                <form name="excluir" action="conexao.php" method="POST">
                                    <input type="hidden" name="id" value=<?=$fornecedor["id"]?> />
                                    <input type="hidden" name="Acao" value="excluir" />
                                    <input type="submit" value="Excluir" name="excluir" />
                                </form>
                            </td>
                        </tr>
                    <?php }
                    ?>
                </tbody>
            </table>
        </form>
    </body>
</html>
