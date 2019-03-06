SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "88007d633738f17019ba1225171df3a4"
SRC_URI[sha256sum] = "c8db35dbb6b470cdedb45195f725bc2cfda7f0dc3155e16a5a37e4b48e29fa59"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "vision_opencv"
