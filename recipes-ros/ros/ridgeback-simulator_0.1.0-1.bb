DESCRIPTION = "Packages for simulating Ridgeback."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ridgeback-gazebo"

RDEPENDS_${PN} = "ridgeback-gazebo"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback_simulator-release/archive/release/melodic/ridgeback_simulator/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2d427849eecdcf21158bd1fd8ee2f04f"
SRC_URI[sha256sum] = "b42f5b32cf7af40f722cb3ba97737601f7cb877a106a3ea273616f374bda8603"

S = "${WORKDIR}/ridgeback_simulator-release-release-melodic-ridgeback_simulator-0.1.0-1"

inherit catkin
