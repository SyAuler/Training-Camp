<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Loja $loja
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Loja'), ['action' => 'edit', $loja->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Loja'), ['action' => 'delete', $loja->id], ['confirm' => __('Are you sure you want to delete # {0}?', $loja->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Lojas'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Loja'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="lojas view large-9 medium-8 columns content">
    <h3><?= h($loja->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Nome') ?></th>
            <td><?= h($loja->nome) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Endereco') ?></th>
            <td><?= $loja->has('endereco') ? $this->Html->link($loja->endereco->id, ['controller' => 'Enderecos', 'action' => 'view', $loja->endereco->id]) : '' ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($loja->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Funcionario Id') ?></th>
            <td><?= $this->Number->format($loja->funcionario_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Inventario Id') ?></th>
            <td><?= $this->Number->format($loja->inventario_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($loja->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($loja->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Funcionarios') ?></h4>
        <?php if (!empty($loja->funcionarios)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Nome') ?></th>
                <th scope="col"><?= __('User Id') ?></th>
                <th scope="col"><?= __('Endereco Id') ?></th>
                <th scope="col"><?= __('Loja Id') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($loja->funcionarios as $funcionarios): ?>
            <tr>
                <td><?= h($funcionarios->id) ?></td>
                <td><?= h($funcionarios->nome) ?></td>
                <td><?= h($funcionarios->user_id) ?></td>
                <td><?= h($funcionarios->endereco_id) ?></td>
                <td><?= h($funcionarios->loja_id) ?></td>
                <td><?= h($funcionarios->loc_id) ?></td>
                <td><?= h($funcionarios->created) ?></td>
                <td><?= h($funcionarios->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Funcionarios', 'action' => 'view', $funcionarios->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Funcionarios', 'action' => 'edit', $funcionarios->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Funcionarios', 'action' => 'delete', $funcionarios->id], ['confirm' => __('Are you sure you want to delete # {0}?', $funcionarios->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Inventarios') ?></h4>
        <?php if (!empty($loja->inventarios)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Carro Id') ?></th>
                <th scope="col"><?= __('Loja Id') ?></th>
                <th scope="col"><?= __('Loc Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($loja->inventarios as $inventarios): ?>
            <tr>
                <td><?= h($inventarios->id) ?></td>
                <td><?= h($inventarios->carro_id) ?></td>
                <td><?= h($inventarios->loja_id) ?></td>
                <td><?= h($inventarios->loc_id) ?></td>
                <td><?= h($inventarios->created) ?></td>
                <td><?= h($inventarios->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Inventarios', 'action' => 'view', $inventarios->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Inventarios', 'action' => 'edit', $inventarios->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Inventarios', 'action' => 'delete', $inventarios->id], ['confirm' => __('Are you sure you want to delete # {0}?', $inventarios->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
</div>
