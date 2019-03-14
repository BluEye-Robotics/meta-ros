DESCRIPTION = "Drive-by-wire messages for the Chrysler Pacifica"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime rosbag-migration-rule"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_msgs/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c489b33c15f8ce870cfd2f6de394cd4c"
SRC_URI[sha256sum] = "c88dcd572943e157cb201add7fcc19f1a1ee7080d6af6b027c2c67bf2d61e041"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_msgs-1.0.1-0"

inherit catkin
