<!DOCTYPE html>
<html>
<head>
    <title>Pessoas</title>
</head>
<body>
<h1>Lista de Pessoas</h1>
<a href="/pessoas/add">Adicionar Pessoa</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Idade</th>
        <th>Endereço</th>
        <th>Escolaridade</th>
        <th>Ações</th>
    </tr>
    </thead>
    <tbody>
    <#list pessoas as pessoa>
        <tr>
            <td>${pessoa.id}</td>
            <td>${pessoa.nome}</td>
            <td>${pessoa.idade}</td>
            <td>${pessoa.endereco}</td>
            <td>${pessoa.escolaridade}</td>
            <td>
                <a href="/pessoas/edit/${pessoa.id}">Editar</a>
                <a href="/pessoas/delete/${pessoa.id}">Excluir</a>
            </td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
