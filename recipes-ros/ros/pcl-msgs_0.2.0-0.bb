DESCRIPTION = "Package containing PCL (Point Cloud Library)-related ROS messages."
AUTHOR = "Open Perception"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation sensor-msgs std-msgs message-runtime sensor-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime sensor-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/pcl_msgs-release/archive/release/melodic/pcl_msgs/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e69cde7f165ac88dd9a8a757d953008d"
SRC_URI[sha256sum] = "e4d2bd132c08b705e38958c8fd8203311af0feefdaa2a3aeeac86cb54e4b6d2b"

S = "${WORKDIR}/pcl_msgs-release-release-melodic-pcl_msgs-0.2.0-0"

inherit catkin
