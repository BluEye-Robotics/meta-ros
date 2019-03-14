DESCRIPTION = "Extends the arbotix_python package with a number of more sophisticated ROS wrappers for common devices."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "arbotix-python trajectory-msgs tf"

RDEPENDS_${PN} = "arbotix-python trajectory-msgs tf"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_controllers/0.10.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0de31f850da4ea1af85e6a9da6737d0c"
SRC_URI[sha256sum] = "32d41d26b0bddb10e801e02195bd604400fddb7aef4bddde8c917a62cecc6028"

ROS_SPN = "arbotix"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix_controllers-0.10.0-0"

inherit catkin
