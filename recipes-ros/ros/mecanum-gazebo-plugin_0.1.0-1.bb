DESCRIPTION = "Plugin which uses directional friction to simulate mecanum wheels."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint gazebo rosconsole"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/clearpath-gbp/ridgeback_simulator-release/archive/release/melodic/mecanum_gazebo_plugin/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "14695e4b68203afd0e0c5f2739d1255f"
SRC_URI[sha256sum] = "99846c791700f0795710304765004fd57ebe2b0b215c6a8b853208cc3571793e"

ROS_SPN = "ridgeback_simulator"
S = "${WORKDIR}/ridgeback_simulator-release-release-melodic-mecanum_gazebo_plugin-0.1.0-1"

inherit catkin
