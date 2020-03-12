<?php

if (isset($_POST["Acao"])) {
    if ($_POST["Acao"] == "inserir") {
        inserirPessoa();
    }
    if ($_POST["Acao"] == "alterar") {
        alterarPessoa();
    }
    if ($_POST["Acao"] == "excluir") {
        excluirPessoa();
    }
}

function abrirBanco() {
    $conexao = new mysqli("Localhost", "root", "", "cliente");
    return $conexao;
}

function inserirPessoa() {
    $banco = abrirBanco();
    $sql = "INSERT INTO fornecedor(cnpj, raz_social, nome_fantasia, cidade, rua, numero, estado, telefone, email, vendedor) "
            . " VALUES ('{$_POST["cnpj"]}','{$_POST["raz_social"]}','{$_POST["nome_fantasia"]}','{$_POST["cidade"]}',"
            . " '{$_POST["rua"]}','{$_POST["numero"]}','{$_POST["estado"]}','{$_POST["telefone"]}','{$_POST["email"]}','{$_POST["vendedor"]}')";
    $banco->query($sql);
    $banco->close();
    voltarIndex();
}

function alterarPessoa() {
    $banco = abrirBanco();
    $sql = "UPDATE fornecedor SET cnpj='{$_POST["cnpj"]}', raz_social='{$_POST["raz_social"]}', nome_fantasia='{$_POST["nome_fantasia"]}', cidade='{$_POST["cidade"]}', rua='{$_POST["rua"]}', numero='{$_POST["numero"]}', estado='{$_POST["estado"]}', telefone='{$_POST["telefone"]}', email='{$_POST["email"]}', vendedor='{$_POST["vendedor"]}' WHERE id='{$_POST["id"]}'";
    $banco->query($sql);
    $banco->close();
    echo $sql;
    voltarIndex();
}

function excluirPessoa() {
    $banco = abrirBanco();
    $sql = "delete from fornecedor where id='{$_POST["id"]}'";
    $banco->query($sql);
    $banco->close();
    voltarIndex();
}

function selectAllPessoa() {
    $banco = abrirBanco();
    $sql = "select * from fornecedor order by nome_fantasia";
    $resultado = $banco->query($sql);
    $banco->close();

    while ($row = mysqli_fetch_array($resultado)) {
        $grupo[] = $row;
    }
    return $grupo;
}

function selectIdPessoa($id) {
    $banco = abrirBanco();
    $sql = "select * from fornecedor where id=" . $id;
    echo $sql;
    $resultado = $banco->query($sql);
    $banco->close();

    $pessoa = mysqli_fetch_assoc($resultado);

    return $pessoa;
}

function voltarIndex() {
    header("Location:index.php");
}
