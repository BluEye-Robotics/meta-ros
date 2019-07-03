DESCRIPTION = "The microstrain_mips package provides a driver for the LORD/Microstrain 3DM_GX5_XX GPS-aided IMU sensor."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "message-generation roscpp cmake-modules tf2 tf2-ros std-msgs std-srvs geometry-msgs sensor-msgs nav-msgs"

RDEPENDS_${PN} = "message-runtime diagnostic-updater diagnostic-aggregator"

SRC_URI = "https://github.com/ros-drivers-gbp/microstrain_mips-release/archive/release/melodic/microstrain_mips/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8abbf2ae5a41887bb0bb650060af661d"
SRC_URI[sha256sum] = "c078e1feeafe6d88910fab89b4d6c5e20c006a0a3b15207513778e8f013059b9"

S = "${WORKDIR}/microstrain_mips-release-release-melodic-microstrain_mips-0.0.2-1"

inherit catkin
