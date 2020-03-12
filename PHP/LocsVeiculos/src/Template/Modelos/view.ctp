<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Modelo $modelo
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Modelo'), ['action' => 'edit', $modelo->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Modelo'), ['action' => 'delete', $modelo->id], ['confirm' => __('Are you sure you want to delete # {0}?', $modelo->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Modelos'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Modelo'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Paises'), ['controller' => 'Paises', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="modelos view large-9 medium-8 columns content">
    <h3><?= h($modelo->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Nome') ?></th>
            <td><?= h($modelo->nome) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($modelo->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Carro Id') ?></th>
            <td><?= $this->Number->format($modelo->carro_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($modelo->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($modelo->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Carros') ?></h4>
        <?php if (!empty($modelo->carros)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Nome') ?></th>
                <th scope="col"><?= __('Modelo Id') ?></th>
                <th scope="col"><?= __('AnoLancamento') ?></th>
                <th scope="col"><?= __('PrecoLocacao') ?></th>
                <th scope="col"><?= __('Observacao') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($modelo->carros as $carros): ?>
            <tr>
                <td><?= h($carros->id) ?></td>
                <td><?= h($carros->nome) ?></td>
                <td><?= h($carros->modelo_id) ?></td>
                <td><?= h($carros->anoLancamento) ?></td>
                <td><?= h($carros->precoLocacao) ?></td>
                <td><?= h($carros->observacao) ?></td>
                <td><?= h($carros->created) ?></td>
                <td><?= h($carros->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Carros', 'action' => 'view', $carros->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Carros', 'action' => 'edit', $carros->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Carros', 'action' => 'delete', $carros->id], ['confirm' => __('Are you sure you want to delete # {0}?', $carros->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
</div>
