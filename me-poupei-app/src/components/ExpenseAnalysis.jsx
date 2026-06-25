import { useState } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card.jsx'
import { Alert, AlertDescription } from '@/components/ui/alert.jsx'
import { Button } from '@/components/ui/button.jsx'
import { Badge } from '@/components/ui/badge.jsx'
import { 
  AlertTriangle, 
  Car, 
  Wrench, 
  TrendingUp, 
  CheckCircle, 
  Droplets,
  Zap,
  ShoppingCart,
  Phone,
  X,
  Eye,
  Calendar
} from 'lucide-react'
import { 
  LineChart, 
  Line, 
  XAxis, 
  YAxis, 
  CartesianGrid, 
  Tooltip, 
  ResponsiveContainer,
  AreaChart,
  Area
} from 'recharts'

const ExpenseAnalysis = () => {
  const [selectedAlert, setSelectedAlert] = useState(null)

  // Dados de tendência para gráficos
  const fuelTrendData = [
    { month: 'Jan', normal: 400, atual: 380 },
    { month: 'Fev', normal: 420, atual: 410 },
    { month: 'Mar', normal: 400, atual: 450 },
    { month: 'Abr', normal: 410, atual: 480 },
    { month: 'Mai', normal: 400, atual: 520 },
    { month: 'Jun', normal: 400, atual: 540 }
  ]

  const waterTrendData = [
    { month: 'Jan', normal: 80, atual: 85 },
    { month: 'Fev', normal: 75, atual: 80 },
    { month: 'Mar', normal: 80, atual: 90 },
    { month: 'Abr', normal: 85, atual: 110 },
    { month: 'Mai', normal: 80, atual: 120 },
    { month: 'Jun', normal: 80, atual: 128 }
  ]

  const alerts = [
    {
      id: 1,
      type: 'warning',
      priority: 'alta',
      icon: Car,
      title: 'Possível Problema no Veículo',
      category: 'Transporte',
      description: 'Seus gastos com combustível aumentaram 35% este mês. Se você manteve os mesmos trajetos, pode indicar problemas no motor, pneus ou sistema de injeção.',
      suggestion: 'Recomendamos uma revisão no veículo. Verifique pressão dos pneus e faça uma análise do consumo.',
      impact: 'R$ 140,00/mês extra',
      confidence: 92,
      trend: 'crescente',
      chartData: fuelTrendData,
      actions: [
        'Verificar pressão dos pneus',
        'Agendar revisão no mecânico',
        'Monitorar consumo por km'
      ]
    },
    {
      id: 2,
      type: 'danger',
      priority: 'crítica',
      icon: Droplets,
      title: 'Possível Vazamento de Água',
      category: 'Casa',
      description: 'Gastos com água aumentaram 60% comparado aos últimos 3 meses. Padrão indica possível vazamento interno.',
      suggestion: 'Verifique torneiras, descargas e tubulações. Considere chamar um encanador.',
      impact: 'R$ 48,00/mês extra',
      confidence: 88,
      trend: 'crescente',
      chartData: waterTrendData,
      actions: [
        'Verificar todas as torneiras',
        'Testar descarga do vaso',
        'Chamar encanador se necessário'
      ]
    },
    {
      id: 3,
      type: 'success',
      priority: 'baixa',
      icon: ShoppingCart,
      title: 'Economia em Alimentação',
      category: 'Alimentação',
      description: 'Seus gastos com alimentação diminuíram 15% mantendo a mesma qualidade. Excelente otimização!',
      suggestion: 'Continue com esse padrão. Considere compartilhar suas estratégias de economia.',
      impact: 'R$ 180,00/mês economizados',
      confidence: 95,
      trend: 'decrescente',
      actions: [
        'Manter estratégia atual',
        'Documentar receitas econômicas',
        'Considerar meal prep'
      ]
    },
    {
      id: 4,
      type: 'info',
      priority: 'média',
      icon: Zap,
      title: 'Energia Elétrica Estável',
      category: 'Casa',
      description: 'Consumo de energia dentro do esperado para a época do ano.',
      suggestion: 'Continue monitorando. Considere trocar lâmpadas por LED para economia adicional.',
      impact: 'Neutro',
      confidence: 78,
      trend: 'estável'
    }
  ]

  const getAlertColor = (type) => {
    switch (type) {
      case 'warning': return 'border-yellow-500 bg-yellow-50 dark:bg-yellow-900/20'
      case 'danger': return 'border-red-500 bg-red-50 dark:bg-red-900/20'
      case 'success': return 'border-green-500 bg-green-50 dark:bg-green-900/20'
      case 'info': return 'border-blue-500 bg-blue-50 dark:bg-blue-900/20'
      default: return 'border-gray-500 bg-gray-50 dark:bg-gray-900/20'
    }
  }

  const getIconColor = (type) => {
    switch (type) {
      case 'warning': return 'text-yellow-600'
      case 'danger': return 'text-red-600'
      case 'success': return 'text-green-600'
      case 'info': return 'text-blue-600'
      default: return 'text-gray-600'
    }
  }

  const getPriorityBadge = (priority) => {
    const variants = {
      'crítica': 'destructive',
      'alta': 'secondary',
      'média': 'outline',
      'baixa': 'default'
    }
    return variants[priority] || 'default'
  }

  return (
    <div className="h-full overflow-auto p-4 space-y-6">
      <div className="flex flex-col space-y-2">
        <h1 className="text-3xl font-bold">Análise Inteligente</h1>
        <p className="text-muted-foreground">
          IA detecta padrões e possíveis problemas em seus gastos
        </p>
      </div>

      {/* Summary Stats */}
      <div className="grid grid-cols-1 md:grid-cols-4 gap-4">
        <Card>
          <CardHeader className="flex flex-row items-center justify-between space-y-0 pb-2">
            <CardTitle className="text-sm font-medium">Alertas Críticos</CardTitle>
            <AlertTriangle className="h-4 w-4 text-red-600" />
          </CardHeader>
          <CardContent>
            <div className="text-2xl font-bold text-red-600">1</div>
            <p className="text-xs text-muted-foreground">
              Requer ação imediata
            </p>
          </CardContent>
        </Card>

        <Card>
          <CardHeader className="flex flex-row items-center justify-between space-y-0 pb-2">
            <CardTitle className="text-sm font-medium">Economia Detectada</CardTitle>
            <TrendingUp className="h-4 w-4 text-green-600" />
          </CardHeader>
          <CardContent>
            <div className="text-2xl font-bold text-green-600">R$ 180,00</div>
            <p className="text-xs text-muted-foreground">
              Este mês
            </p>
          </CardContent>
        </Card>

        <Card>
          <CardHeader className="flex flex-row items-center justify-between space-y-0 pb-2">
            <CardTitle className="text-sm font-medium">Precisão IA</CardTitle>
            <CheckCircle className="h-4 w-4 text-blue-600" />
          </CardHeader>
          <CardContent>
            <div className="text-2xl font-bold text-blue-600">94%</div>
            <p className="text-xs text-muted-foreground">
              Acurácia das previsões
            </p>
          </CardContent>
        </Card>

        <Card>
          <CardHeader className="flex flex-row items-center justify-between space-y-0 pb-2">
            <CardTitle className="text-sm font-medium">Monitoramento</CardTitle>
            <Calendar className="h-4 w-4 text-purple-600" />
          </CardHeader>
          <CardContent>
            <div className="text-2xl font-bold text-purple-600">24/7</div>
            <p className="text-xs text-muted-foreground">
              Análise contínua
            </p>
          </CardContent>
        </Card>
      </div>

      {/* Alerts */}
      <div className="space-y-4">
        <div className="flex items-center justify-between">
          <h2 className="text-xl font-semibold">Alertas e Recomendações</h2>
          <Badge variant="outline" className="text-xs">
            {alerts.length} alertas ativos
          </Badge>
        </div>
        
        {alerts.map((alert) => {
          const Icon = alert.icon
          const isSelected = selectedAlert === alert.id
          
          return (
            <Card key={alert.id} className={`border-l-4 ${getAlertColor(alert.type)} transition-all duration-200 ${isSelected ? 'ring-2 ring-primary/20' : ''}`}>
              <CardHeader>
                <div className="flex items-start justify-between">
                  <div className="flex items-center gap-3">
                    <Icon className={`h-5 w-5 ${getIconColor(alert.type)}`} />
                    <div>
                      <CardTitle className="text-base">{alert.title}</CardTitle>
                      <div className="flex items-center gap-2 mt-1">
                        <Badge variant={getPriorityBadge(alert.priority)} className="text-xs">
                          {alert.priority}
                        </Badge>
                        <Badge variant="outline" className="text-xs">
                          {alert.category}
                        </Badge>
                        <span className="text-xs text-muted-foreground">
                          {alert.confidence}% confiança
                        </span>
                      </div>
                    </div>
                  </div>
                  <Button
                    variant="ghost"
                    size="sm"
                    onClick={() => setSelectedAlert(isSelected ? null : alert.id)}
                  >
                    {isSelected ? <X className="h-4 w-4" /> : <Eye className="h-4 w-4" />}
                  </Button>
                </div>
              </CardHeader>
              
              <CardContent className="space-y-4">
                <p className="text-sm text-muted-foreground">
                  {alert.description}
                </p>
                
                <div className="flex items-center gap-4 text-sm">
                  <span className="font-medium">Impacto: {alert.impact}</span>
                  {alert.trend && (
                    <span className={`flex items-center gap-1 ${
                      alert.trend === 'crescente' ? 'text-red-600' : 
                      alert.trend === 'decrescente' ? 'text-green-600' : 
                      'text-gray-600'
                    }`}>
                      <TrendingUp className="h-3 w-3" />
                      {alert.trend}
                    </span>
                  )}
                </div>

                {isSelected && (
                  <div className="space-y-4 pt-4 border-t">
                    {/* Gráfico de tendência */}
                    {alert.chartData && (
                      <div>
                        <h4 className="font-medium mb-2">Tendência dos últimos 6 meses</h4>
                        <ResponsiveContainer width="100%" height={200}>
                          <AreaChart data={alert.chartData}>
                            <CartesianGrid strokeDasharray="3 3" className="opacity-30" />
                            <XAxis dataKey="month" className="text-xs" />
                            <YAxis className="text-xs" />
                            <Tooltip 
                              formatter={(value, name) => [
                                `R$ ${value}`, 
                                name === 'normal' ? 'Esperado' : 'Atual'
                              ]}
                            />
                            <Area 
                              type="monotone" 
                              dataKey="normal" 
                              stackId="1"
                              stroke="#94a3b8" 
                              fill="#94a3b8" 
                              fillOpacity={0.3}
                            />
                            <Area 
                              type="monotone" 
                              dataKey="atual" 
                              stackId="2"
                              stroke={alert.type === 'success' ? '#22c55e' : '#ef4444'} 
                              fill={alert.type === 'success' ? '#22c55e' : '#ef4444'} 
                              fillOpacity={0.6}
                            />
                          </AreaChart>
                        </ResponsiveContainer>
                      </div>
                    )}

                    {/* Ações recomendadas */}
                    {alert.actions && (
                      <div>
                        <h4 className="font-medium mb-2">Ações Recomendadas</h4>
                        <ul className="space-y-1">
                          {alert.actions.map((action, index) => (
                            <li key={index} className="text-sm flex items-center gap-2">
                              <CheckCircle className="h-3 w-3 text-green-600" />
                              {action}
                            </li>
                          ))}
                        </ul>
                      </div>
                    )}
                  </div>
                )}

                <Alert>
                  <AlertDescription className="font-medium">
                    💡 {alert.suggestion}
                  </AlertDescription>
                </Alert>
              </CardContent>
            </Card>
          )
        })}
      </div>
    </div>
  )
}

export default ExpenseAnalysis

