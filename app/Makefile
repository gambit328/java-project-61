.PHONY: run run-dist build clean help install-dist

run-dist: install-dist ## Запуск дистрибутива
	./build/install/app/bin/app
install-dist: ## Установка дистрибутива
	./gradlew installDist
run: ## Запуск
	./gradlew run --console=plain
build: ## Сборка приложения
	./gradlew build
clean: ## Очищает все временные и сгенерированные файлы
	./gradlew clean
help: ## Список доступных команд
	@grep -E '^[a-z_-]+: [#]{2} [а-яА-я ]+' Makefile