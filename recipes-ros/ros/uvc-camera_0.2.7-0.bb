DESCRIPTION = "A collection of node(let)s that stream images from USB cameras (UVC) and provide CameraInfo messages to consumers. Includes a two-camera node that provides rough synchronization for stereo vision. Currently uses the base driver from Morgan Quigley's uvc_cam package."
AUTHOR = "Ken Tossell"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "roscpp camera-info-manager image-transport nodelet sensor-msgs libv4l-dev roscpp camera-info-manager image-transport nodelet sensor-msgs libv4l-dev"

RDEPENDS_${PN} = "roscpp camera-info-manager image-transport nodelet sensor-msgs libv4l-dev"

SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/melodic/uvc_camera/0.2.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ed075c43470ff425fd27b9e97cd6074a"
SRC_URI[sha256sum] = "3a760fad6164fa6a5ed47d7cd6302f5378bae282f5018dc568d2666b867cdb46"

ROS_SPN = "camera_umd"
S = "${WORKDIR}/camera_umd-release-release-melodic-uvc_camera-0.2.7-0"

inherit catkin
