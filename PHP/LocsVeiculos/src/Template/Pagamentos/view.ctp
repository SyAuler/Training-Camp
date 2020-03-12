<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Pagamento $pagamento
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Pagamento'), ['action' => 'edit', $pagamento->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Pagamento'), ['action' => 'delete', $pagamento->id], ['confirm' => __('Are you sure you want to delete # {0}?', $pagamento->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Pagamento'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="pagamentos view large-9 medium-8 columns content">
    <h3><?= h($pagamento->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Funcionario') ?></th>
            <td><?= $pagamento->has('funcionario') ? $this->Html->link($pagamento->funcionario->id, ['controller' => 'Funcionarios', 'action' => 'view', $pagamento->funcionario->id]) : '' ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($pagamento->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Valor') ?></th>
            <td><?= $this->Number->format($pagamento->valor) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Loc Id') ?></th>
            <td><?= $this->Number->format($pagamento->loc_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Cliente Id') ?></th>
            <td><?= $this->Number->format($pagamento->cliente_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('DataPagamento') ?></th>
            <td><?= h($pagamento->dataPagamento) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($pagamento->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($pagamento->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Locs') ?></h4>
        <?php if (!empty($pagamento->locs)): ?>
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
            <?php foreach ($pagamento->locs as $locs): ?>
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
    <div class="related">
        <h4><?= __('Related Clientes') ?></h4>
        <?php if (!empty($pagamento->clientes)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Nome') ?></th>
                <th scope="col"><?= __('Cpf') ?></th>
                <th scope="col"><?= __('Email') ?></th>
                <th scope="col"><?= __('Endereco Id') ?></th>
                <th scope="col"><?= __('Funcionario Id') ?></th>
                <th scope="col"><?= __('Pagamento Id') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($pagamento->clientes as $clientes): ?>
            <tr>
                <td><?= h($clientes->id) ?></td>
                <td><?= h($clientes->nome) ?></td>
                <td><?= h($clientes->cpf) ?></td>
                <td><?= h($clientes->email) ?></td>
                <td><?= h($clientes->endereco_id) ?></td>
                <td><?= h($clientes->funcionario_id) ?></td>
                <td><?= h($clientes->pagamento_id) ?></td>
                <td><?= h($clientes->loc_id) ?></td>
                <td><?= h($clientes->created) ?></td>
                <td><?= h($clientes->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Clientes', 'action' => 'view', $clientes->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Clientes', 'action' => 'edit', $clientes->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Clientes', 'action' => 'delete', $clientes->id], ['confirm' => __('Are you sure you want to delete # {0}?', $clientes->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
</div>
