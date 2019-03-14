DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "robot gazebo-ros-pkgs rqt-common-plugins rqt-robot-plugins stage-ros"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/simulators/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aec7b7a9bbc87d64ebf2bc8343592cef"
SRC_URI[sha256sum] = "5a6ddc7bfbe78170db5541bdab3f2ab031abcd787b4d087e41d010acb6de2455"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-simulators-1.4.1-0"

inherit catkin
