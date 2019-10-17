DESCRIPTION = "Metapackage for Clearpath Husky simulation software"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "husky-gazebo"

RDEPENDS_${PN} = "husky-gazebo"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_simulator/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a2da267c0c7819af5914fa4b60b9bf09"
SRC_URI[sha256sum] = "9f73115dee3431c7262dcc6921ba8d83d42a240c777095d9e7f2605845b7b05a"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_simulator-0.4.1-1"

inherit catkin
