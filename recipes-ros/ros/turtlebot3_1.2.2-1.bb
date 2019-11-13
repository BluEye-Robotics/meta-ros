DESCRIPTION = "ROS packages for the Turtlebot3 (meta package)"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "turtlebot3-bringup turtlebot3-description turtlebot3-example turtlebot3-navigation turtlebot3-slam turtlebot3-teleop"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4bd805759baa52f53bef1fb178b525b"
SRC_URI[sha256sum] = "74e13982b319116e6b0ae5bebc8e9a37b816e5e10d2335876320fa1178d2131f"

S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3-1.2.2-1"

inherit catkin
