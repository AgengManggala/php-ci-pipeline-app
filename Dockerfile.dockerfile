FROM php:8.1-cli

# Install Composer
COPY --from=composer:latest /usr/bin/composer /usr/bin/composer

# Copy source code
COPY . /app
WORKDIR /app

# Install dependencies
RUN composer install