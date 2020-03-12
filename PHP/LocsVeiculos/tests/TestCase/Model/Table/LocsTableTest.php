<?php
namespace App\Test\TestCase\Model\Table;

use App\Model\Table\LocsTable;
use Cake\ORM\TableRegistry;
use Cake\TestSuite\TestCase;

/**
 * App\Model\Table\LocsTable Test Case
 */
class LocsTableTest extends TestCase
{
    /**
     * Test subject
     *
     * @var \App\Model\Table\LocsTable
     */
    public $Locs;

    /**
     * Fixtures
     *
     * @var array
     */
    public $fixtures = [
        'app.Locs',
        'app.Pagamentos',
        'app.Clientes',
        'app.Funcionarios',
        'app.Inventarios'
    ];

    /**
     * setUp method
     *
     * @return void
     */
    public function setUp()
    {
        parent::setUp();
        $config = TableRegistry::getTableLocator()->exists('Locs') ? [] : ['className' => LocsTable::class];
        $this->Locs = TableRegistry::getTableLocator()->get('Locs', $config);
    }

    /**
     * tearDown method
     *
     * @return void
     */
    public function tearDown()
    {
        unset($this->Locs);

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
