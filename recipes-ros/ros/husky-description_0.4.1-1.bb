DESCRIPTION = "Clearpath Husky URDF description"
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch urdf xacro lms1xx"

RDEPENDS_${PN} = "urdf xacro lms1xx"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_description/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "754bcb1f946b4bac046921ada3f56a90"
SRC_URI[sha256sum] = "d4c33dfc90776e53c36ce501ac33351d2567eafce3da02d56fe818a43c52c7f0"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_description-0.4.1-1"

inherit catkin
