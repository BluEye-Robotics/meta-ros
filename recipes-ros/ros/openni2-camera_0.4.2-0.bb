DESCRIPTION = "Drivers for the Asus Xtion and Primesense Devices. For using a kinect with ROS, try the"
AUTHOR = "Julius Kammerl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libopenni2-dev camera-info-manager nodelet sensor-msgs roscpp dynamic-reconfigure image-transport message-generation libopenni2-dev camera-info-manager nodelet dynamic-reconfigure sensor-msgs roscpp image-transport message-runtime"

RDEPENDS_${PN} = "libopenni2-dev camera-info-manager nodelet dynamic-reconfigure sensor-msgs roscpp image-transport message-runtime"

SRC_URI = "https://github.com/ros-gbp/openni2_camera-release/archive/release/melodic/openni2_camera/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9368d367a1e254d0ae5c9e8cec310081"
SRC_URI[sha256sum] = "d154919dd68c19a6255bbbafd1d238d30baae4e6b146eb17875002511180181f"

S = "${WORKDIR}/openni2_camera-release-release-melodic-openni2_camera-0.4.2-0"

inherit catkin
