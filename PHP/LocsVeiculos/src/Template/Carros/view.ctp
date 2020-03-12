<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Carro $carro
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Carro'), ['action' => 'edit', $carro->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Carro'), ['action' => 'delete', $carro->id], ['confirm' => __('Are you sure you want to delete # {0}?', $carro->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Carro'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
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
<div class="carros view large-9 medium-8 columns content">
    <h3><?= h($carro->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Nome') ?></th>
            <td><?= h($carro->nome) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($carro->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modelo Id') ?></th>
            <td><?= $this->Number->format($carro->modelo_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('PrecoLocacao') ?></th>
            <td><?= $this->Number->format($carro->precoLocacao) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('AnoLancamento') ?></th>
            <td><?= h($carro->anoLancamento) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($carro->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($carro->modified) ?></td>
        </tr>
    </table>
    <div class="row">
        <h4><?= __('Observacao') ?></h4>
        <?= $this->Text->autoParagraph(h($carro->observacao)); ?>
    </div>
    <div class="related">
        <h4><?= __('Related Modelos') ?></h4>
        <?php if (!empty($carro->modelos)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Nome') ?></th>
                <th scope="col"><?= __('Carro Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($carro->modelos as $modelos): ?>
            <tr>
                <td><?= h($modelos->id) ?></td>
                <td><?= h($modelos->nome) ?></td>
                <td><?= h($modelos->carro_id) ?></td>
                <td><?= h($modelos->created) ?></td>
                <td><?= h($modelos->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Modelos', 'action' => 'view', $modelos->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Modelos', 'action' => 'edit', $modelos->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Modelos', 'action' => 'delete', $modelos->id], ['confirm' => __('Are you sure you want to delete # {0}?', $modelos->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
    <div class="related">
        <h4><?= __('Related Inventarios') ?></h4>
        <?php if (!empty($carro->inventarios)): ?>
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
            <?php foreach ($carro->inventarios as $inventarios): ?>
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
