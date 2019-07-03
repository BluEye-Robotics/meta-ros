DESCRIPTION = "A driver for IMUs compatible the microstrain 3DM-GX2 and 3DM-GX3 protocol. Includes a heavily modified standalone driver pulled from the player distribution, and a ROS node."
AUTHOR = "Jeremy Leibs"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "roscpp log4cxx message-generation sensor-msgs self-test diagnostic-updater tf std-srvs std-msgs roscpp log4cxx message-runtime sensor-msgs self-test diagnostic-updater tf std-srvs std-msgs"

RDEPENDS_${PN} = "roscpp log4cxx message-runtime sensor-msgs self-test diagnostic-updater tf std-srvs std-msgs"

SRC_URI = "https://github.com/ros-gbp/microstrain_3dmgx2_imu-release/archive/release/melodic/microstrain_3dmgx2_imu/1.5.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5593d1a6c9997484c4769c26a0703868"
SRC_URI[sha256sum] = "c0d438f4cc98005f507ce6f99dff72f69f881867b3826fbd90c356f358a9e36c"

S = "${WORKDIR}/microstrain_3dmgx2_imu-release-release-melodic-microstrain_3dmgx2_imu-1.5.13-1"

inherit catkin
