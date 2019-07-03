DESCRIPTION = "This package is used to manually control a robot that uses the operator and navigator node from navigation_2d. Currently there is one node to control one robot with a joystick and one to control multiple robots in simulation. It can send commands directly to the operator or start and stop navigator actions."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "nav2d-navigator nav2d-operator roscpp sensor-msgs nav2d-navigator nav2d-operator roscpp sensor-msgs"

RDEPENDS_${PN} = "nav2d-navigator nav2d-operator roscpp sensor-msgs"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_remote/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa73ae279664c9c065332226a7a35089"
SRC_URI[sha256sum] = "91aa99978a86691724e4b4079baa5825b7f19ec127b1ca8d349af55c22cd64fa"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_remote-0.4.2-0"

inherit catkin
