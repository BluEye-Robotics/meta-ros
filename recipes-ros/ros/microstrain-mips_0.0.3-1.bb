DESCRIPTION = "The microstrain_mips package provides a driver for the LORD/Microstrain 3DM_GX5_XX GPS-aided IMU sensor."
AUTHOR = "Brian Bingham"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "message-generation roslint roscpp cmake-modules diagnostic-updater tf2 tf2-ros std-msgs std-srvs geometry-msgs sensor-msgs nav-msgs"

RDEPENDS_${PN} = "message-runtime diagnostic-aggregator"

SRC_URI = "https://github.com/ros-drivers-gbp/microstrain_mips-release/archive/release/melodic/microstrain_mips/0.0.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "466e7e4e4888a2d6d185bd2372fe5e53"
SRC_URI[sha256sum] = "e2515dc2da635d80ae7b579480bdd99af254238a034528dea3deb3248c806ffd"

S = "${WORKDIR}/microstrain_mips-release-release-melodic-microstrain_mips-0.0.3-1"

inherit catkin
