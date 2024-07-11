<!DOCTYPE html>
<html>
<head>
    <title>Adicionar Pessoa</title>
</head>
<body>
<h1>Adicionar Pessoa</h1>
<form action="/pessoas/add" method="post">
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" required><br><br>
    <label for="idade">Idade:</label>
    <input type="number" id="idade" name="idade" required><br><br>
    <label for="endereco">Endereço:</label>
    <input type="text" id="endereco" name="endereco" required><br><br>
    <label for="escolaridade">Escolaridade:</label>
    <input type="text" id="escolaridade" name="escolaridade" required><br><br>
    <input type="submit" value="Adicionar">
</form>
<a href="/pessoas">Voltar</a>
</body>
</html>
