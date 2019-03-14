DESCRIPTION = "An open-source version of the Fetch charge docking system."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "angles actionlib libeigen fetch-auto-dock-msgs fetch-driver-msgs geometry-msgs nav-msgs roscpp roslib rospy sensor-msgs std-msgs tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_open_auto_dock-gbp/archive/release/melodic/fetch_open_auto_dock/0.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d8d89284745d41e34f4c23cca00f1631"
SRC_URI[sha256sum] = "73cbede7be9f363559992d9bab141eea8b9c4ac72928fb567e0542cfb0ea7c2a"

S = "${WORKDIR}/fetch_open_auto_dock-gbp-release-melodic-fetch_open_auto_dock-0.1.2-0"

inherit catkin
