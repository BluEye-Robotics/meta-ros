DESCRIPTION = "The public fetch_drivers package is a binary only release. fetch_drivers contains both the drivers and firmware for the fetch and freight research robots. There should be no reason to use these drivers unless you're running on a fetch or a freight research robot. This package, is a cmake/make only package which installs the binaries for the drivers and firmware."
AUTHOR = "Alexander Moriarty"
SECTION = "devel"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=1fcc2f243daac9b962ca04b90988c4f3"

DEPENDS = "mk rospack boost curl python yaml-cpp actionlib-msgs diagnostic-msgs fetch-driver-msgs fetch-auto-dock-msgs nav-msgs power-msgs robot-calibration-msgs sensor-msgs actionlib robot-controllers robot-controllers-interface rosconsole roscpp-serialization roscpp rostime urdf urdfdom"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_robots-release/archive/release/melodic/fetch_drivers/0.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8503cd88933330b52a813d59d927d79d"
SRC_URI[sha256sum] = "1a93f3a08200d27d455c1fffb0d9aaf712183b52e4627161f9c3a65ba5164a62"

ROS_SPN = "fetch_robots"
S = "${WORKDIR}/fetch_robots-release-release-melodic-fetch_drivers-0.8.8-1"

inherit catkin
