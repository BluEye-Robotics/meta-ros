DESCRIPTION = "Clearpath Husky installation and integration package"
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch husky-base husky-control husky-description imu-filter-madgwick imu-transformer lms1xx microstrain-3dmgx2-imu microstrain-mips nmea-comms nmea-navsat-driver python-scipy robot-localization robot-upstart tf tf2-ros um6 um7"

RDEPENDS_${PN} = "husky-base husky-control husky-description imu-filter-madgwick imu-transformer lms1xx microstrain-3dmgx2-imu microstrain-mips nmea-comms nmea-navsat-driver python-scipy robot-localization robot-upstart tf tf2-ros um6 um7"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_bringup/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0f60a66a9a8d3b1e3c6a2c8a1257f64e"
SRC_URI[sha256sum] = "d94a3ac3e2d841447e45337001c85b359031895c14c7330d9c26997a851b4589"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_bringup-0.4.1-1"

inherit catkin
