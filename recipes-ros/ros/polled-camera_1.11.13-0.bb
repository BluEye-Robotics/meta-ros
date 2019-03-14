DESCRIPTION = "polled_camera contains a service and C++ helper classes for implementing a polled camera driver node and requesting images from it. The package is currently for internal use as the API is still under development."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "image-transport message-generation roscpp sensor-msgs std-msgs image-transport message-runtime roscpp sensor-msgs std-msgs"

RDEPENDS_${PN} = "image-transport message-runtime roscpp sensor-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/melodic/polled_camera/1.11.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "53c13fd64e960476569cbc388dad14dd"
SRC_URI[sha256sum] = "87717ae0569b27aeccb0c84c372ef5e5b16ea23e4549f918d7a2ad1ba88464f3"

ROS_SPN = "image_common"
S = "${WORKDIR}/image_common-release-release-melodic-polled_camera-1.11.13-0"

inherit catkin
