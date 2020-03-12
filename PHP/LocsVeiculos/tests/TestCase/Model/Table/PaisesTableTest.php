<?php
namespace App\Test\TestCase\Model\Table;

use App\Model\Table\PaisesTable;
use Cake\ORM\TableRegistry;
use Cake\TestSuite\TestCase;

/**
 * App\Model\Table\PaisesTable Test Case
 */
class PaisesTableTest extends TestCase
{
    /**
     * Test subject
     *
     * @var \App\Model\Table\PaisesTable
     */
    public $Paises;

    /**
     * Fixtures
     *
     * @var array
     */
    public $fixtures = [
        'app.Paises',
        'app.Cidades'
    ];

    /**
     * setUp method
     *
     * @return void
     */
    public function setUp()
    {
        parent::setUp();
        $config = TableRegistry::getTableLocator()->exists('Paises') ? [] : ['className' => PaisesTable::class];
        $this->Paises = TableRegistry::getTableLocator()->get('Paises', $config);
    }

    /**
     * tearDown method
     *
     * @return void
     */
    public function tearDown()
    {
        unset($this->Paises);

        parent::tearDown();
    }

    /**
     * Test initialize method
     *
     * @return void
     */
    public function testInitialize()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }

    /**
     * Test validationDefault method
     *
     * @return void
     */
    public function testValidationDefault()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }

    /**
     * Test buildRules method
     *
     * @return void
     */
    public function testBuildRules()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }
}
