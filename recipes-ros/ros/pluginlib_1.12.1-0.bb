DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins using the ROS build infrastructure. To work, these tools require plugin providers to register their plugins in the package. xml of their package."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules boost class-loader rosconsole roslib libtinyxml2"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/pluginlib-release/archive/release/melodic/pluginlib/1.12.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cc26f399bf73ffe5fc2ca52bb711ecb4"
SRC_URI[sha256sum] = "51ad8cc72b954cf0fb32b8e562eaa2f24d830ce72832320582ec2075b95958e1"

S = "${WORKDIR}/pluginlib-release-release-melodic-pluginlib-1.12.1-0"

inherit catkin
