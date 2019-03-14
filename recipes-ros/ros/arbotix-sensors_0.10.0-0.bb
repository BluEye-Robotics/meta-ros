DESCRIPTION = "Extends the arbotix_node package with a number of more sophisticated ROS wrappers for common devices."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "arbotix-python"

RDEPENDS_${PN} = "arbotix-python"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_sensors/0.10.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8e92a45f802c49a92652a0c9a285f17a"
SRC_URI[sha256sum] = "2c7dcfa8c133915b15eb77783282f2be0b01ac676239daefba4285885e58f722"

ROS_SPN = "arbotix"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix_sensors-0.10.0-0"

inherit catkin
