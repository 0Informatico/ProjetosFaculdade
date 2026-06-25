import { useState, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card.jsx'
import { Button } from '@/components/ui/button.jsx'
import { Mic, MicOff, Volume2 } from 'lucide-react'

const VoiceChat = () => {
  const [isListening, setIsListening] = useState(false)
  const [conversation, setConversation] = useState([])
  const [currentResponse, setCurrentResponse] = useState('')

  // Simulate AI response
  useEffect(() => {
    if (isListening) {
      const timer = setTimeout(() => {
        setIsListening(false)
        setCurrentResponse('Entendi sua pergunta sobre finanças. Baseado nos seus gastos, posso sugerir algumas otimizações...')
        
        setTimeout(() => {
          setCurrentResponse('')
        }, 4000)
      }, 3000)
      
      return () => clearTimeout(timer)
    }
  }, [isListening])

  return (
    <div className="h-full flex flex-col items-center justify-center p-4 bg-gradient-to-br from-background to-muted/20">
      <Card className="w-full max-w-lg">
        <CardHeader className="text-center">
          <CardTitle className="text-2xl">Conversa com IA</CardTitle>
          <p className="text-muted-foreground">
            Converse naturalmente sobre suas finanças
          </p>
        </CardHeader>
        <CardContent className="flex flex-col items-center space-y-6">
          {/* Animated Voice Visualization */}
          <div className="relative flex items-center justify-center">
            {/* Outer ripple rings */}
            {isListening && (
              <>
                <div className="absolute w-48 h-48 rounded-full border-2 border-primary/20 animate-ping" />
                <div className="absolute w-40 h-40 rounded-full border-2 border-primary/30 animate-ping" style={{animationDelay: '0.5s'}} />
                <div className="absolute w-32 h-32 rounded-full border-2 border-primary/40 animate-ping" style={{animationDelay: '1s'}} />
              </>
            )}
            
            {/* Main voice circle */}
            <div className={`
              relative w-28 h-28 rounded-full bg-gradient-to-br from-primary/20 to-primary/40 
              flex items-center justify-center transition-all duration-300 shadow-lg
              ${isListening ? 'scale-110 shadow-primary/25' : 'hover:scale-105'}
            `}>
              {/* Sound waves when listening */}
              {isListening && (
                <div className="absolute inset-0 flex items-center justify-center">
                  <div className="flex space-x-1">
                    {[...Array(5)].map((_, i) => (
                      <div
                        key={i}
                        className="w-1 bg-primary rounded-full animate-pulse"
                        style={{
                          height: `${Math.random() * 20 + 10}px`,
                          animationDelay: `${i * 0.1}s`,
                          animationDuration: '0.5s'
                        }}
                      />
                    ))}
                  </div>
                </div>
              )}
              
              {/* Microphone icon */}
              <div className="relative z-10">
                {isListening ? (
                  <Volume2 className="h-8 w-8 text-primary animate-pulse" />
                ) : (
                  <Mic className="h-8 w-8 text-primary" />
                )}
              </div>
            </div>
          </div>

          {/* AI Response Display */}
          {currentResponse && (
            <Card className="w-full bg-muted/50 border-primary/20">
              <CardContent className="p-4">
                <div className="flex items-start gap-3">
                  <div className="w-8 h-8 rounded-full bg-primary/10 flex items-center justify-center flex-shrink-0">
                    <Volume2 className="h-4 w-4 text-primary" />
                  </div>
                  <p className="text-sm text-muted-foreground animate-pulse">
                    {currentResponse}
                  </p>
                </div>
              </CardContent>
            </Card>
          )}

          {/* Control Button */}
          <Button
            size="lg"
            onClick={() => setIsListening(!isListening)}
            className={`w-full transition-all duration-300 ${
              isListening 
                ? 'bg-red-600 hover:bg-red-700 text-white' 
                : 'bg-primary hover:bg-primary/90'
            }`}
          >
            {isListening ? (
              <>
                <MicOff className="h-4 w-4 mr-2" />
                Parar Gravação
              </>
            ) : (
              <>
                <Mic className="h-4 w-4 mr-2" />
                Iniciar Conversa
              </>
            )}
          </Button>

          {/* Status */}
          <div className="text-center space-y-2">
            <p className={`text-sm font-medium transition-colors duration-300 ${
              isListening ? 'text-primary' : 'text-muted-foreground'
            }`}>
              {isListening 
                ? '🎤 Ouvindo... Fale agora!' 
                : '💬 Pronto para conversar sobre finanças'
              }
            </p>
            <p className="text-xs text-muted-foreground">
              Pergunte sobre orçamento, investimentos ou análise de gastos
            </p>
          </div>
        </CardContent>
      </Card>
    </div>
  )
}

export default VoiceChat

