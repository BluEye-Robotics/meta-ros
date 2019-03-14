DESCRIPTION = "The video_stream_opencv package contains a node to publish a video stream (the protocols that opencv supports are supported, including rtsp, webcams on /dev/video and video files) in ROS image topics, it supports camera info and basic image flipping (horizontal, vertical or both) capabilities, also adjusting publishing rate."
AUTHOR = "Sammy Pfeiffer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge image-transport camera-info-manager roscpp rospy sensor-msgs cv-bridge image-transport camera-info-manager roscpp rospy sensor-msgs"

RDEPENDS_${PN} = "cv-bridge image-transport camera-info-manager roscpp rospy sensor-msgs"

SRC_URI = "https://github.com/ros-drivers/video_stream_opencv-release/archive/release/melodic/video_stream_opencv/1.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3d478edd9ab26d4c46fbb8d4cc603c47"
SRC_URI[sha256sum] = "ed2b46c502c9f63dbc62af074bbf0407d249c84f8509227ae5d2346204fe1186"

S = "${WORKDIR}/video_stream_opencv-release-release-melodic-video_stream_opencv-1.1.5-0"

inherit catkin
