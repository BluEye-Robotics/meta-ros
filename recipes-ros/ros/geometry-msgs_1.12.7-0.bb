DESCRIPTION = "geometry_msgs provides messages for common geometric primitives such as points, vectors, and poses. These primitives are designed to provide a common data type and facilitate interoperability throughout the system."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/geometry_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9106c2300fd9a9f6dfc8e426aec22f73"
SRC_URI[sha256sum] = "60734262caf065a7eabc82f5c4033e3107a00a204e706a3884d6ee12fcac4d11"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-geometry_msgs-1.12.7-0"

inherit catkin
