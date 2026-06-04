package com.hypers.server;

interface IHypersServiceConnection {

    oneway void connected(IBinder service);

    oneway void died();
}
