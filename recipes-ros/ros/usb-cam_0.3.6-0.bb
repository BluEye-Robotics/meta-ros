DESCRIPTION = "A ROS Driver for V4L USB Cameras"
AUTHOR = "Benjamin Pitzer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "image-transport roscpp std-msgs std-srvs sensor-msgs ffmpeg camera-info-manager image-transport roscpp std-msgs std-srvs sensor-msgs ffmpeg camera-info-manager v4l-utils"

RDEPENDS_${PN} = "image-transport roscpp std-msgs std-srvs sensor-msgs ffmpeg camera-info-manager v4l-utils"

SRC_URI = "https://github.com/ros-gbp/usb_cam-release/archive/release/melodic/usb_cam/0.3.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "15edd87c953ee20501093ea8fcb1c8fb"
SRC_URI[sha256sum] = "21a2fa956af929b771c989bdb53a572443481b101cea0ba0b66547e0440a9bd5"

S = "${WORKDIR}/usb_cam-release-release-melodic-usb_cam-0.3.6-0"

inherit catkin
