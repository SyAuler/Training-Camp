<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Cliente $cliente
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Cliente'), ['action' => 'edit', $cliente->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Cliente'), ['action' => 'delete', $cliente->id], ['confirm' => __('Are you sure you want to delete # {0}?', $cliente->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Clientes'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Cliente'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="clientes view large-9 medium-8 columns content">
    <h3><?= h($cliente->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Nome') ?></th>
            <td><?= h($cliente->nome) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Cpf') ?></th>
            <td><?= h($cliente->cpf) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Email') ?></th>
            <td><?= h($cliente->email) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Funcionario') ?></th>
            <td><?= $cliente->has('funcionario') ? $this->Html->link($cliente->funcionario->id, ['controller' => 'Funcionarios', 'action' => 'view', $cliente->funcionario->id]) : '' ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($cliente->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Endereco Id') ?></th>
            <td><?= $this->Number->format($cliente->endereco_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Pagamento Id') ?></th>
            <td><?= $this->Number->format($cliente->pagamento_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Loc Id') ?></th>
            <td><?= $this->Number->format($cliente->loc_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($cliente->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($cliente->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Enderecos') ?></h4>
        <?php if (!empty($cliente->enderecos)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Endereco') ?></th>
                <th scope="col"><?= __('Numero') ?></th>
                <th scope="col"><?= __('Bairro') ?></th>
                <th scope="col"><?= __('Cep') ?></th>
                <th scope="col"><?= __('Telefone') ?></th>
                <th scope="col"><?= __('Cidade Id') ?></th>
                <th scope="col"><?= __('Cliente Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($cliente->enderecos as $enderecos): ?>
            <tr>
                <td><?= h($enderecos->id) ?></td>
                <td><?= h($enderecos->endereco) ?></td>
                <td><?= h($enderecos->numero) ?></td>
                <td><?= h($enderecos->bairro) ?></td>
                <td><?= h($enderecos->cep) ?></td>
                <td><?= h($enderecos->telefone) ?></td>
                <td><?= h($enderecos->cidade_id) ?></td>
                <td><?= h($enderecos->cliente_id) ?></td>
                <td><?= h($enderecos->funcionario_id) ?></td>
                <td><?= h($enderecos->created) ?></td>
                <td><?= h($enderecos->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Enderecos', 'action' => 'view', $enderecos->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Enderecos', 'action' => 'edit', $enderecos->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Enderecos', 'action' => 'delete', $enderecos->id], ['confirm' => __('Are you sure you want to delete # {0}?', $enderecos->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Pagamentos') ?></h4>
        <?php if (!empty($cliente->pagamentos)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Valor') ?></th>
                <th scope="col"><?= __('DataPagamento') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Cliente Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($cliente->pagamentos as $pagamentos): ?>
            <tr>
                <td><?= h($pagamentos->id) ?></td>
                <td><?= h($pagamentos->valor) ?></td>
                <td><?= h($pagamentos->dataPagamento) ?></td>
                <td><?= h($pagamentos->loc_id) ?></td>
                <td><?= h($pagamentos->cliente_id) ?></td>
                <td><?= h($pagamentos->funcionario_id) ?></td>
                <td><?= h($pagamentos->created) ?></td>
                <td><?= h($pagamentos->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Pagamentos', 'action' => 'view', $pagamentos->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Pagamentos', 'action' => 'edit', $pagamentos->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Pagamentos', 'action' => 'delete', $pagamentos->id], ['confirm' => __('Are you sure you want to delete # {0}?', $pagamentos->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Locs') ?></h4>
        <?php if (!empty($cliente->locs)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('DataLocs') ?></th>
                <th scope="col"><?= __('DataDevolucao') ?></th>
                <th scope="col"><?= __('Pagamento Id') ?></th>
                <th scope="col"><?= __('Cliente Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Inventario Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($cliente->locs as $locs): ?>
            <tr>
                <td><?= h($locs->id) ?></td>
                <td><?= h($locs->dataLocs) ?></td>
                <td><?= h($locs->dataDevolucao) ?></td>
                <td><?= h($locs->pagamento_id) ?></td>
                <td><?= h($locs->cliente_id) ?></td>
                <td><?= h($locs->funcionario_id) ?></td>
                <td><?= h($locs->inventario_id) ?></td>
                <td><?= h($locs->created) ?></td>
                <td><?= h($locs->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Locs', 'action' => 'view', $locs->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Locs', 'action' => 'edit', $locs->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Locs', 'action' => 'delete', $locs->id], ['confirm' => __('Are you sure you want to delete # {0}?', $locs->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
</div>
