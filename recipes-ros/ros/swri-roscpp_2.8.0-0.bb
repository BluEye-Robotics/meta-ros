DESCRIPTION = "swri_roscpp"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-updater dynamic-reconfigure marti-common-msgs nav-msgs roscpp std-msgs std-srvs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_roscpp/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa4306e4d5297588ddbf92a2d0d260da"
SRC_URI[sha256sum] = "3bdea82fbf4bc4b3aad6f4b209877e9c34926fc2c7a3a732215a9f3c9a9aeffb"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_roscpp-2.8.0-0"

inherit catkin
