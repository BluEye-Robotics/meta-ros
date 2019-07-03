DESCRIPTION = "multisense_ros"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs stereo-msgs genmsg message-generation message-runtime tf multisense-lib rosbag sensor-msgs geometry-msgs image-transport angles dynamic-reconfigure image-geometry cv-bridge libturbojpeg roscpp std-msgs stereo-msgs genmsg message-generation message-runtime tf multisense-lib rosbag sensor-msgs geometry-msgs image-transport angles dynamic-reconfigure image-geometry cv-bridge libturbojpeg"

RDEPENDS_${PN} = "roscpp std-msgs stereo-msgs genmsg message-generation message-runtime tf multisense-lib rosbag sensor-msgs geometry-msgs image-transport angles dynamic-reconfigure image-geometry cv-bridge libturbojpeg"

SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense_ros/4.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c3be46a3f76962abc46b02569a532f05"
SRC_URI[sha256sum] = "c1b2959f4247366b8fffeab9da15990e326707d8abfe4967b16065d6ec3a2af8"

S = "${WORKDIR}/multisense_ros-release-release-melodic-multisense_ros-4.0.2-0"

inherit catkin
