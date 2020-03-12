<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Paise $paise
 */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('Edit Paise'), ['action' => 'edit', $paise->id]) ?> </li>
        <li><?= $this->Form->postLink(__('Delete Paise'), ['action' => 'delete', $paise->id], ['confirm' => __('Are you sure you want to delete # {0}?', $paise->id)]) ?> </li>
        <li><?= $this->Html->link(__('List Paises'), ['action' => 'index']) ?> </li>
        <li><?= $this->Html->link(__('New Pais'), ['action' => 'add']) ?> </li>
        <li><?= $this->Html->link(__('List Carros'), ['controller' => 'Carros', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Cidades'), ['controller' => 'Cidades', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Clientes'), ['controller' => 'Clientes', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Enderecos'), ['controller' => 'Enderecos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Funcionarios'), ['controller' => 'Funcionarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Inventarios'), ['controller' => 'Inventarios', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Locacao'), ['controller' => 'Locs', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Lojas'), ['controller' => 'Lojas', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Modelos'), ['controller' => 'Modelos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Pagamentos'), ['controller' => 'Pagamentos', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Rules'), ['controller' => 'Rules', 'action' => 'index']) ?></li>
        <li><?= $this->Html->link(__('List Users'), ['controller' => 'Users', 'action' => 'index']) ?></li>
        </ul>
</nav>
<div class="paises view large-9 medium-8 columns content">
    <h3><?= h($paise->id) ?></h3>
    <table class="vertical-table">
        <tr>
            <th scope="row"><?= __('Pais') ?></th>
            <td><?= h($paise->pais) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Id') ?></th>
            <td><?= $this->Number->format($paise->id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Cidade Id') ?></th>
            <td><?= $this->Number->format($paise->cidade_id) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Created') ?></th>
            <td><?= h($paise->created) ?></td>
        </tr>
        <tr>
            <th scope="row"><?= __('Modified') ?></th>
            <td><?= h($paise->modified) ?></td>
        </tr>
    </table>
    <div class="related">
        <h4><?= __('Related Cidades') ?></h4>
        <?php if (!empty($paise->cidades)): ?>
        <table cellpadding="0" cellspacing="0">
            <tr>
                <th scope="col"><?= __('Id') ?></th>
                <th scope="col"><?= __('Cidade') ?></th>
                <th scope="col"><?= __('Paise Id') ?></th>
                <th scope="col"><?= __('Endereco Id') ?></th>
                <th scope="col"><?= __('Created') ?></th>
                <th scope="col"><?= __('Modified') ?></th>
                <th scope="col" class="actions"><?= __('Actions') ?></th>
            </tr>
            <?php foreach ($paise->cidades as $cidades): ?>
            <tr>
                <td><?= h($cidades->id) ?></td>
                <td><?= h($cidades->cidade) ?></td>
                <td><?= h($cidades->paise_id) ?></td>
                <td><?= h($cidades->endereco_id) ?></td>
                <td><?= h($cidades->created) ?></td>
                <td><?= h($cidades->modified) ?></td>
                <td class="actions">
                    <?= $this->Html->link(__('View'), ['controller' => 'Cidades', 'action' => 'view', $cidades->id]) ?>
                    <?= $this->Html->link(__('Edit'), ['controller' => 'Cidades', 'action' => 'edit', $cidades->id]) ?>
                    <?= $this->Form->postLink(__('Delete'), ['controller' => 'Cidades', 'action' => 'delete', $cidades->id], ['confirm' => __('Are you sure you want to delete # {0}?', $cidades->id)]) ?>
                </td>
            </tr>
            <?php endforeach; ?>
        </table>
        <?php endif; ?>
    </div>
</div>
