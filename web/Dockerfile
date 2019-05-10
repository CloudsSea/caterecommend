FROM node:8.9.2

COPY . /web
WORKDIR ./web
RUN npm install --registry=https://registry.npm.taobao.org
COPY . /web

EXPOSE 3000
CMD [ "npm", "start" ]