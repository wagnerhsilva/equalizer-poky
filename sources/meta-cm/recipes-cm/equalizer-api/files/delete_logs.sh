#!/bin/sh
/etc/init.d/snmpd stop
sqlite3 /var/www/equalizer-api/equalizer-api/equalizerdb "PRAGMA busy_timeout=60000;"
sqlite3 /var/www/equalizer-api/equalizer-api/equalizerdb "PRAGMA journal_mode=WAL;"
sqlite3 /var/www/equalizer-api/equalizer-api/equalizerdb "DELETE FROM DataLog;"
sqlite3 /var/www/equalizer-api/equalizer-api/equalizerdb "DELETE FROM AlarmLog;"
sqlite3 /var/www/equalizer-api/equalizer-api/equalizerdb "VACUUM;"
reboot
