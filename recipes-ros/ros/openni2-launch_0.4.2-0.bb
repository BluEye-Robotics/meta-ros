DESCRIPTION = "Launch files to start the openni2_camera drivers using rgbd_launch."
AUTHOR = "Julius Kammerl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-catkin-pkg roslaunch rgbd-launch depth-image-proc image-proc nodelet openni2-camera rospy roswtf tf usbutils"

RDEPENDS_${PN} = "rgbd-launch depth-image-proc image-proc nodelet openni2-camera rospy roswtf tf usbutils"

SRC_URI = "https://github.com/ros-gbp/openni2_camera-release/archive/release/melodic/openni2_launch/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "79efdc2b10a6858cb9e157a35cf7c720"
SRC_URI[sha256sum] = "51d7ca0ca441737e619194d4ffbfcf7dd76a586724845ca4641394967d2286a1"

ROS_SPN = "openni2_camera"
S = "${WORKDIR}/openni2_camera-release-release-melodic-openni2_launch-0.4.2-0"

inherit catkin
