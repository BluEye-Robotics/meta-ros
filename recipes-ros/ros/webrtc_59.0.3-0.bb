DESCRIPTION = "WebRTC Native API"
AUTHOR = "Mitchell Wills"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gtk2 gtk3 libasound2-dev libglib-dev libpulse-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/RobotWebTools-release/webrtc_ros-release/archive/release/melodic/webrtc/59.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b0fa8f24a41aa98f18cd835b1cdec6a7"
SRC_URI[sha256sum] = "bdc2b6651bda28702a87bdc1cb9a53dbcd5a47dc7363d71bd81ea87dc0271e77"

ROS_SPN = "webrtc_ros"
S = "${WORKDIR}/webrtc_ros-release-release-melodic-webrtc-59.0.3-0"

inherit catkin
