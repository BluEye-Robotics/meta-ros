DESCRIPTION = "Ethernet interface to OxTS GPS receivers (NCOM packet structure)"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs sensor-msgs nav-msgs gps-common tf"

RDEPENDS_${PN} = "roslaunch"

SRC_URI = "https://github.com/DataspeedInc-release/oxford_gps_eth-release/archive/release/melodic/oxford_gps_eth/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bbbd7d2c6ffb2cb571df6c4995ccdf94"
SRC_URI[sha256sum] = "e746691aeed3c6c6613c51e9be0db75d5c0d5c2442453823a466fa15cac9ee7e"

S = "${WORKDIR}/oxford_gps_eth-release-release-melodic-oxford_gps_eth-1.0.0-0"

inherit catkin
